<?php
/***
 * ���鳣�ú���
 *
**/ 

/**
 * ���ݴ���������������ֵ�ļ�ֵ����������ļ������滻
 *
 * @param array $array
 * @param string $key
 */
function array_bind_key($array, $key ){
	foreach( (array)$array as $value ){
		if(!empty($value[$key])){
			$k = $value[$key];
			$result[$k] = $value;
		}
	}
	return $result;
}

/**
 * ���ݴ��������������еļ�ֵ�����������������
 *
 * @param array $array ��ά����
 * @param string $field	�ֶ�
 * @param string $direction ����
 */
function array_sort_key($arr, $field, $direction='SORT_ASC'){
	$arrSort = array();
	foreach($arr AS $uniqid => $row){
		foreach($row AS $key=>$value){
			$arrSort[$key][$uniqid] = $value;
		}
	}
	array_multisort($arrSort[$field], constant($direction), $arr);
	return $arr;
}