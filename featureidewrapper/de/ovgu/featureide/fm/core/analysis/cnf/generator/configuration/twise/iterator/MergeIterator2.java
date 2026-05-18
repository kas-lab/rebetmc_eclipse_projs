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
//import java.util.ArrayList;
//import java.util.List;
//import java.util.function.Supplier;
//
//import de.ovgu.featureide.fm.core.analysis.cnf.ClauseList;
//import de.ovgu.featureide.fm.core.analysis.cnf.generator.configuration.twise.PresenceCondition;
//import de.ovgu.featureide.fm.core.analysis.cnf.generator.configuration.twise.TWiseCombiner;
//import de.ovgu.featureide.fm.core.analysis.cnf.generator.configuration.twise.iterator.IteratorFactory.IteratorID;
//
//public class MergeIterator2 implements Supplier<ClauseList> {
//
//	private final List<PresenceCondition>[] expressionSets;
//	private final Supplier<int[]>[] suppliers;
//	private final long numberOfCombinations;
//	private final int t;
//
//	List<ClauseList> buffer = new ArrayList<>();
//	List<ClauseList> buffer2 = new ArrayList<>();
//
//	private int maxIteratorIndex;
//	private int bufferIndex;
//
//	public MergeIterator2(int t, List<List<PresenceCondition>> expressionSets, IteratorID id) {
//		this.t = t;
//		suppliers = new ArrayList<>(expressionSets.size());
//		long sumNumberOfCombinations = 0;
//		for (final List<PresenceCondition> expressions : expressionSets) {
//			final RandomPartitionSupplier supplier = new RandomPartitionSupplier(t, expressions.size());
//			suppliers.add(supplier);
//			sumNumberOfCombinations += supplier.size();
//		}
//		numberOfCombinations = sumNumberOfCombinations;
//	}
//
//	@Override
//	public ClauseList get() {
//		final TWiseCombiner combiner = new TWiseCombiner(10);
//		final PresenceCondition[] nextCombination = new PresenceCondition[t];
//
//		if (buffer.isEmpty()) {
//			for (int i = 0; i < maxIteratorIndex; i++) {
//				final int[] js = setIterators[i].get();
//				if (js == null) {
//					setIterators[i] = setIterators[maxIteratorIndex];
//					setIterators[maxIteratorIndex] = null;
//					maxIteratorIndex--;
//				}
//				for (int j = 0; j < js.length; j++) {
//					nextCombination[j] = expressionSets[i].get(js[j]);
//				}
//				final ClauseList combinedCondition = new ClauseList();
//				combiner.combineConditions(nextCombination, combinedCondition);
//				final int size = combinedCondition.size();
//				if (size == 0) {
//
//				} else if (size == 1) {
//					buffer.add(combinedCondition);
//				} else {
//					buffer2.add(combinedCondition);
//				}
//			}
//			if (buffer.isEmpty()) {
//				buffer.addAll(buffer2);
//				buffer2.clear();
//			}
//			if (buffer.isEmpty()) {
//				return null;
//			}
//		}
//		final ClauseList remove = buffer.remove(bufferIndex++);
//		if (bufferIndex == buffer.size()) {
//			buffer.clear();
//		}
//		return remove;
//	}
//
//}
