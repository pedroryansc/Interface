public class ControleRemoto extends EquipamentoEletronico implements IControle {
	
	private int cargaPilha;

	public int getCargaPilha() {
		return cargaPilha;
	}

	public void setCargaPilha(int cargaPilha) {
		this.cargaPilha = cargaPilha;
	}

	@Override
	public boolean ligaDesliga() {
		return false;
	}

	@Override
	public int alterarCanal(int canal) {
		return 0;
	}

	@Override
	public int canalMais() {
		return 0;
	}

	@Override
	public int canalMenos() {
		return 0;
	}

	@Override
	public int volumeMais() {
		return 0;
	}

	@Override
	public int volumeMenos() {
		return 0;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ControleRemoto [cargaPilha=");
		builder.append(cargaPilha);
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