///* FeatureIDE - A Framework for Feature-Oriented Software Development
// * Copyright (C) 2005-2019  FeatureIDE team, University of Magdeburg, Germany
// *
// * This file is part of FeatureIDE.
// *
// * FeatureIDE is free software: you can redistribute it and/or modify
// * it under the terms of the GNU Lesser General Public License as published by
// * the Free Software Foundation, either version 3 of the License, or
// * (at your option) any later version.
// *
// * FeatureIDE is distributed in the hope that it will be useful,
// * but WITHOUT ANY WARRANTY; without even the implied warranty of
// * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// * GNU Lesser General Public License for more details.
// *
// * You should have received a copy of the GNU Lesser General Public License
// * along with FeatureIDE.  If not, see <http://www.gnu.org/licenses/>.
// *
// * See http://featureide.cs.ovgu.de/ for further information.
// */
//package de.ovgu.featureide.fm.core.analysis.cnf.generator.configuration.twise.iterator;
//
///**
// *
// * @author Sebastian Krieter
// */
//public class LexicographicSupplier implements ICombinationSupplier<int[]> {
//
//	private final int[] c;
//
//	protected final int t, n;
//	protected final long numCombinations;
//
//	public LexicographicSupplier(int t, int n) {
//		this.t = t;
//		this.n = n;
//		numCombinations = new BinomialCalculator(t, n).binomial(n, t);
//		c = new int[t];
//		for (int i = 0; i < (c.length - 1); i++) {
//			c[i] = i;
//		}
//		c[t - 1] = t - 2;
//	}
//
//	@Override
//	public int[] get() {
//		int i = t;
//		for (; i > 0; i--) {
//			final int ci = ++c[i - 1];
//			if (ci < ((n - t) + i)) {
//				break;
//			}
//		}
//		if ((i == 0) && (c[i] == ((n - t) + 1))) {
//			return null;
//		}
//
//		for (; i < t; i++) {
//			if (i == 0) {
//				c[i] = 0;
//			} else {
//				c[i] = c[i - 1] + 1;
//			}
//		}
//
//		return c;
//	}
//
//	@Override
//	public long size() {
//		return numCombinations;
//	}
//
//}
