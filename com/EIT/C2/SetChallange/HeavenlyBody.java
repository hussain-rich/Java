package com.EIT.C2.SetChallange;

import java.util.HashSet;
import java.util.Set;

public abstract class HeavenlyBody {
	public enum BodyTypes {
		PLANET, DWARF_PLANET, MOON
	}

	private final Key key;
	private final double orbitalPeriod;
	private final Set<HeavenlyBody> satellites;

	public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyType) {
		this.key = new Key(name, bodyType);
		this.orbitalPeriod = orbitalPeriod;
		this.satellites = new HashSet<>();
	}

	public double getOrbitalPeriod() {
		return orbitalPeriod;
	}

	public Key getKey() {
		return key;
	}

	public boolean addSatellite(HeavenlyBody moon) {
		if (moon.getKey().getBodyType() == BodyTypes.MOON) {
			return this.satellites.add(moon);
		} else {
			return false;
		}
	}

	public Set<HeavenlyBody> getSatellites() {
		return new HashSet<>(this.satellites);
	}

	@Override
	public final boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof HeavenlyBody) {
			HeavenlyBody theObject = (HeavenlyBody) obj;
			return this.key.equals(theObject.getKey());
		}
		return false;
	}

	@Override
	public final int hashCode() {
		return this.key.hashCode() + 57;
	}

	public static Key makeKey(String name, BodyTypes bodyType) {
		return new Key(name, bodyType);
	}

	@Override
	public String toString() {
		return this.key.getName() + ": " + this.key.getBodyType() + ", " + this.orbitalPeriod;
	}

	public static final class Key {
		private final String name;
		private final BodyTypes bodyType;

		private Key(String name, BodyTypes bodyType) {
			this.name = name;
			this.bodyType = bodyType;
		}

		public String getName() {
			return name;
		}

		public BodyTypes getBodyType() {
			return bodyType;
		}

		@Override
		public final boolean equals(Object obj) {
			if (this == obj) {
				return true;
			}
			if (obj instanceof Key) {
				Key theKey = (Key) obj;
				if (this.name.equals(theKey.getName())) {
					return this.bodyType == theKey.getBodyType();
				}
			}
			return false;
		}

		@Override
		public final int hashCode() {
			return this.name.hashCode() + this.bodyType.hashCode() + 57;
		}

		@Override
		public String toString() {
			return this.name + ": " + this.bodyType;
		}
	}
}
