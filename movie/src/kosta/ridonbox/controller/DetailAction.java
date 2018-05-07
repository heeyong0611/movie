package kosta.ridonbox.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta.ridonbox.model.dto.ModelAndView;

/**
 * ��ȭ�� ������ �̵��� ����ϴ� Action
 * ��û��: ���� ��ȭ
 * ���䰪: ������ȭ�� �ش��ϴ� ����
 */
public class DetailAction implements Action {

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		ModelAndView mv = new ModelAndView();
		mv.setPath("detail.jsp");
		return mv;
	}

}
