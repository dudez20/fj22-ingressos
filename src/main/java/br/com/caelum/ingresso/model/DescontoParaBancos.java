package br.com.caelum.ingresso.model;

import java.math.BigDecimal;

public class DescontoParaBancos implements Desconto{
	
	@Override
	public BigDecimal aplicarDescontoSobre(BigDecimal precoOriginal){
		return precoOriginal.subtract(trintapPorCentoSobre(precoOriginal));
	}
	
	private BigDecimal trintapPorCentoSobre(BigDecimal precoOriginal){
		return precoOriginal.multiply(new BigDecimal("0,3"));
	}
}
