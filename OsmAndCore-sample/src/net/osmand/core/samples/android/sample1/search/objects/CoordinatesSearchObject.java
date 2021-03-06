package net.osmand.core.samples.android.sample1.search.objects;

import net.osmand.core.jni.PointI;
import net.osmand.core.jni.QStringStringHash;

public class CoordinatesSearchObject extends SearchPositionObject {

	public CoordinatesSearchObject(PointI position31) {
		super(SearchObjectType.COORDINATES, position31);
	}

	@Override
	public PointI getPosition31() {
		return (PointI) getInternalObject();
	}

	@Override
	public String getNativeName() {
		return null;
	}

	@Override
	protected QStringStringHash getLocalizedNames() {
		return null;
	}
}
