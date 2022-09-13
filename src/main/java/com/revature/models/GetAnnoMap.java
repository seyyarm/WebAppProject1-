package com.revature.models;

import java.lang.reflect.Field;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.revature.annotations.GeneratedId;
import com.revature.annotations.GeneratedIdSetter;
import com.revature.annotations.NonId;
import com.revature.annotations.NonIdGetter;
import com.revature.annotations.NonIdSetter;
import com.revature.models.getLists;

public class GetAnnoMap {

	
	public static Map<Integer, String> getNonIdFields(Object entry) {
		List<Field> nonIdFields = getLists.getNonIdFields(entry);
		Map<Integer, String> fieldAnnoMap = new TreeMap<Integer, String>();
		
		for (Field field:nonIdFields) {
			NonId anno = field.getAnnotation(NonId.class);
			int paramKey = anno.column();
			String paramValue = field.getName();
			fieldAnnoMap.put(paramKey, paramValue);
		}
		return fieldAnnoMap;
	}
	
	public static Map<Integer, String> getIdFields(Object entry) {
		List<Field> idFields = getLists.getGeneratedIds(entry);
		Map<Integer, String> fieldAnnoMap = new TreeMap<Integer, String>();
		
		for (Field field:idFields) {
			GeneratedId anno = field.getAnnotation(GeneratedId.class);
			int paramKey = anno.column();
			String paramValue = field.getName();
			fieldAnnoMap.put(paramKey, paramValue);
		}
		return fieldAnnoMap;
	}
	
	public static Map<Integer, String> getAllFieldNames(Object entry) {
		List<Field> idFields = getLists.getAllFields(entry);
		Map<Integer, String> fieldAnnoMap = new TreeMap<Integer, String>();
		
		for (Field field:idFields) {
			if (field.isAnnotationPresent(GeneratedId.class)) {
				GeneratedId anno = field.getAnnotation(GeneratedId.class);
				int paramKey = anno.column();
				String paramValue = field.getName();
				fieldAnnoMap.put(paramKey, paramValue);
			}
			if (field.isAnnotationPresent(NonId.class)) {
				NonId anno = field.getAnnotation(NonId.class);
				int paramKey = anno.column();
				String paramValue = field.getName();
				fieldAnnoMap.put(paramKey, paramValue);
			}
		}
		return fieldAnnoMap;
	}
	
	public static Map<Integer, String> getFieldTypes(Object entry) {
		List<Field> idFields = getLists.getAllFields(entry);
		Map<Integer, String> fieldAnnoMap = new TreeMap<Integer, String>();
		
		for (Field field:idFields) {
			if (field.isAnnotationPresent(GeneratedId.class)) {
				GeneratedId anno = field.getAnnotation(GeneratedId.class);
				int paramKey = anno.column();
				String paramValue = field.getType().toString();
				fieldAnnoMap.put(paramKey, paramValue);
			}
			if (field.isAnnotationPresent(NonId.class)) {
				NonId anno = field.getAnnotation(NonId.class);
				int paramKey = anno.column();
				String paramValue = field.getType().toString();
				fieldAnnoMap.put(paramKey, paramValue);
			}
		}
		return fieldAnnoMap;
	}
	
	public static Map<Integer, String> getNonIdGetters(Object entry) {
		List<Method> getters = getLists.getNonIdGetters(entry);
		Map<Integer, String> methodAnnoMap = new TreeMap<Integer, String>();
		
		for (Method getter:getters) {
			try{
				Object obj = getter.invoke(entry);
				NonIdGetter anno = getter.getAnnotation(NonIdGetter.class);
				int paramKey = anno.column();
				String paramValue = obj.toString();
				methodAnnoMap.put(paramKey, paramValue);
				
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e){
				e.printStackTrace();
			}
		}
		return methodAnnoMap;
	}
	
	public static Map<Integer, Method> getIdSetterMethods(Object entry) {
		Method[] methods = entry.getClass().getDeclaredMethods();
		Map<Integer, Method> methodAnnoMap = new TreeMap<Integer, Method>();
		
		for (Method method:methods) {
			if (method.isAnnotationPresent(GeneratedIdSetter.class))
				try{
					GeneratedIdSetter anno = method.getAnnotation(GeneratedIdSetter.class);
					int paramKey = anno.column();
    				methodAnnoMap.put(paramKey, method);
					
				} catch (IllegalArgumentException e){
					e.printStackTrace();
				}
		}
		return methodAnnoMap;
	}
	
	public static Map<Integer, Method> getAllSetterMethods(Object entry) {
		Method[] methods = entry.getClass().getDeclaredMethods();
		Map<Integer, Method> methodAnnoMap = new TreeMap<Integer, Method>();
		
		for (Method method:methods) {
			if (method.isAnnotationPresent(GeneratedIdSetter.class)) {
				try{
					GeneratedIdSetter anno = method.getAnnotation(GeneratedIdSetter.class);
					int paramKey = anno.column();
    				methodAnnoMap.put(paramKey, method);
					
				} catch (IllegalArgumentException e){
					e.printStackTrace();
				}
			}
			if (method.isAnnotationPresent(NonIdSetter.class)) {
				try{
					NonIdSetter anno = method.getAnnotation(NonIdSetter.class);
					int paramKey = anno.column();
    				methodAnnoMap.put(paramKey, method);
					
				} catch (IllegalArgumentException e){
					e.printStackTrace();
				}
			}
				
		}
		return methodAnnoMap;
	}
	
	public static Map<Integer, Method> getNonIdSetterMethods(Object entry) {
		Method[] methods = entry.getClass().getDeclaredMethods();
		Map<Integer, Method> methodAnnoMap = new TreeMap<Integer, Method>();
		
		for (Method method:methods) {
			if (method.isAnnotationPresent(NonIdSetter.class))
				try{
					NonIdSetter anno = method.getAnnotation(NonIdSetter.class);
					int paramKey = anno.column();
    				methodAnnoMap.put(paramKey, method);
					
				} catch (IllegalArgumentException e){
					e.printStackTrace();
				}
		}
		return methodAnnoMap;
	}
	
	public static Map<Integer, Method> getNonIdGetterMethods(Object entry) {
		Method[] methods = entry.getClass().getDeclaredMethods();
		Map<Integer, Method> methodAnnoMap = new TreeMap<Integer, Method>();
		
		for (Method method:methods) {
			if (method.isAnnotationPresent(NonIdGetter.class))
				try{
					NonIdGetter anno = method.getAnnotation(NonIdGetter.class);
					int paramKey = anno.column();
    				methodAnnoMap.put(paramKey, method);
					
				} catch (IllegalArgumentException e){
					e.printStackTrace();
				}
		}
		return methodAnnoMap;
	}
	
}
