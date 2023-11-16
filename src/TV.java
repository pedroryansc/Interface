public class TV extends EquipamentoEletronico implements IControle {
	
	// Comportamento = Interface, Estrutura = Classe
	
	private String marca;
	private String modelo;
	private boolean estado;
	private int volume;
	private int canal;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		this.canal = canal;
	}
	
	@Override
	public boolean ligaDesliga() {
		if(estado) {
			setEstado(false);
			return false;
		} else {
			setEstado(true);
			return true;
		}
	}
	@Override
	public int alterarCanal(int canal) {
		if(canal > 0 && canal <= 10) {
			setCanal(canal);
			return canal;
		} else
			return this.canal;
	}
	@Override
	public int canalMais() {
		if(canal < 10)
			setCanal(canal + 1);
		else
			setCanal(1);
		return canal;
		/*
		int canalMais = canal + 1;
		if(canalMais <= 10) {
			setCanal(canalMais);
			return canalMais;
		} else {
			setCanal(1);
			return 1;
		}
		*/
	}
	@Override
	public int canalMenos() {
		if(canal > 1)
			setCanal(canal - 1);
		else
			setCanal(10);
		return canal;
		/*
		int canalMenos = canal - 1;
		if(canalMenos > 0) {
			setCanal(canalMenos);
			return canalMenos;
		} else {
			setCanal(10);
			return 10;
		}
		*/
	}
	@Override
	public int volumeMais() {
		if(volume < 20)
			setVolume(volume + 1);
		return volume;
		/*
		int volMais = volume + 1;
		if(volMais <= 20) {
			setVolume(volMais);
			return volMais;
		} else
			return volume;
		*/
	}
	@Override
	public int volumeMenos() {
		if(volume > 0)
			setVolume(volume - 1);
		return volume;
		/*
		int volMenos = volume - 1;
		if(volMenos >= 0) {
			setVolume(volMenos);
			return volMenos;
		} else
			return volume;
		*/
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TV [marca=");
		builder.append(marca);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", estado=");
		builder.append(estado);
		builder.append(", volume=");
		builder.append(volume);
		builder.append(", canal=");
		builder.append(canal);
		builder.append(", getTensao()=");
		builder.append(getTensao());
		builder.append(", getConsumo()=");
		builder.append(getConsumo());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append("]");
		return builder.toString();
	}
}