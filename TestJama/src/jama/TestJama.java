package jama;

import Jama.Matrix;  // ����Jama���е�Matrix��

public class TestJama {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("����jama����ɾ�������");
		
		double [][] array = {
				{-1, 1, 0},
				{-4, 3, 0},
				{1, 0, 2}
		};
		
		System.out.println("�����ֽ�");
		// http://zhidao.baidu.com/link?url=KZY21A85_YfXLCw-4dZlES5AdgjXkQg4uuogjLsv6WvGV3VM9sBkTOQUofPpEzRqSO0WwlVrBMi8e-9hd4Rhoa
		Matrix A = new Matrix(array); 
		A.eig().getD().print(4, 2);   // �Խ�Ԫ��������ֵ��4���еĿ�ȣ�2����С������λ��
		A.eig().getV().print(4, 2);   // ��������

		System.out.println("����ά��");
		int rowNum = A.getRowDimension();  // ��������
		int colNum = A.getColumnDimension(); 
		System.out.println(rowNum + " " + colNum); 
		
		System.out.println("����ʽ");
		double detNum = A.det();   // ����ʽ
		System.out.println(detNum); 
	}

}
