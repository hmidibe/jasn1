/**
 * This class file was automatically generated by jASN1 (http://www.beanit.com)
 */

package com.beanit.jasn1.compiler.tagging_test;

import java.io.IOException;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.io.Serializable;
import com.beanit.jasn1.ber.*;
import com.beanit.jasn1.ber.types.*;
import com.beanit.jasn1.ber.types.string.*;


public class ChoiceOfDirectTypes implements BerType, Serializable {

	private static final long serialVersionUID = 1L;

	public byte[] code = null;
	public static class UntaggedChoice implements BerType, Serializable {

		private static final long serialVersionUID = 1L;

		public byte[] code = null;
		private BerInteger myInteger = null;
		private BerBoolean myBoolean = null;
		
		public UntaggedChoice() {
		}

		public UntaggedChoice(byte[] code) {
			this.code = code;
		}

		public void setMyInteger(BerInteger myInteger) {
			this.myInteger = myInteger;
		}

		public BerInteger getMyInteger() {
			return myInteger;
		}

		public void setMyBoolean(BerBoolean myBoolean) {
			this.myBoolean = myBoolean;
		}

		public BerBoolean getMyBoolean() {
			return myBoolean;
		}

		public int encode(OutputStream reverseOS) throws IOException {

			if (code != null) {
				for (int i = code.length - 1; i >= 0; i--) {
					reverseOS.write(code[i]);
				}
				return code.length;
			}

			int codeLength = 0;
			if (myBoolean != null) {
				codeLength += myBoolean.encode(reverseOS, false);
				// write tag: CONTEXT_CLASS, PRIMITIVE, 4
				reverseOS.write(0x84);
				codeLength += 1;
				return codeLength;
			}
			
			if (myInteger != null) {
				codeLength += myInteger.encode(reverseOS, false);
				// write tag: CONTEXT_CLASS, PRIMITIVE, 3
				reverseOS.write(0x83);
				codeLength += 1;
				return codeLength;
			}
			
			throw new IOException("Error encoding CHOICE: No element of CHOICE was selected.");
		}

		public int decode(InputStream is) throws IOException {
			return decode(is, null);
		}

		public int decode(InputStream is, BerTag berTag) throws IOException {

			int codeLength = 0;
			BerTag passedTag = berTag;

			if (berTag == null) {
				berTag = new BerTag();
				codeLength += berTag.decode(is);
			}

			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 3)) {
				myInteger = new BerInteger();
				codeLength += myInteger.decode(is, false);
				return codeLength;
			}

			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 4)) {
				myBoolean = new BerBoolean();
				codeLength += myBoolean.decode(is, false);
				return codeLength;
			}

			if (passedTag != null) {
				return 0;
			}

			throw new IOException("Error decoding CHOICE: Tag " + berTag + " matched to no item.");
		}

		public void encodeAndSave(int encodingSizeGuess) throws IOException {
			ReverseByteArrayOutputStream reverseOS = new ReverseByteArrayOutputStream(encodingSizeGuess);
			encode(reverseOS);
			code = reverseOS.getArray();
		}

		public String toString() {
			StringBuilder sb = new StringBuilder();
			appendAsString(sb, 0);
			return sb.toString();
		}

		public void appendAsString(StringBuilder sb, int indentLevel) {

			if (myInteger != null) {
				sb.append("myInteger: ").append(myInteger);
				return;
			}

			if (myBoolean != null) {
				sb.append("myBoolean: ").append(myBoolean);
				return;
			}

			sb.append("<none>");
		}

	}

	public static class TaggedChoice implements BerType, Serializable {

		private static final long serialVersionUID = 1L;

		public byte[] code = null;
		private BerInteger myInteger = null;
		private BerBoolean myBoolean = null;
		
		public TaggedChoice() {
		}

		public TaggedChoice(byte[] code) {
			this.code = code;
		}

		public void setMyInteger(BerInteger myInteger) {
			this.myInteger = myInteger;
		}

		public BerInteger getMyInteger() {
			return myInteger;
		}

		public void setMyBoolean(BerBoolean myBoolean) {
			this.myBoolean = myBoolean;
		}

		public BerBoolean getMyBoolean() {
			return myBoolean;
		}

		public int encode(OutputStream reverseOS) throws IOException {

			if (code != null) {
				for (int i = code.length - 1; i >= 0; i--) {
					reverseOS.write(code[i]);
				}
				return code.length;
			}

			int codeLength = 0;
			if (myBoolean != null) {
				codeLength += myBoolean.encode(reverseOS, false);
				// write tag: CONTEXT_CLASS, PRIMITIVE, 4
				reverseOS.write(0x84);
				codeLength += 1;
				return codeLength;
			}
			
			if (myInteger != null) {
				codeLength += myInteger.encode(reverseOS, false);
				// write tag: CONTEXT_CLASS, PRIMITIVE, 3
				reverseOS.write(0x83);
				codeLength += 1;
				return codeLength;
			}
			
			throw new IOException("Error encoding CHOICE: No element of CHOICE was selected.");
		}

		public int decode(InputStream is) throws IOException {
			return decode(is, null);
		}

		public int decode(InputStream is, BerTag berTag) throws IOException {

			int codeLength = 0;
			BerTag passedTag = berTag;

			if (berTag == null) {
				berTag = new BerTag();
				codeLength += berTag.decode(is);
			}

			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 3)) {
				myInteger = new BerInteger();
				codeLength += myInteger.decode(is, false);
				return codeLength;
			}

			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 4)) {
				myBoolean = new BerBoolean();
				codeLength += myBoolean.decode(is, false);
				return codeLength;
			}

			if (passedTag != null) {
				return 0;
			}

			throw new IOException("Error decoding CHOICE: Tag " + berTag + " matched to no item.");
		}

		public void encodeAndSave(int encodingSizeGuess) throws IOException {
			ReverseByteArrayOutputStream reverseOS = new ReverseByteArrayOutputStream(encodingSizeGuess);
			encode(reverseOS);
			code = reverseOS.getArray();
		}

		public String toString() {
			StringBuilder sb = new StringBuilder();
			appendAsString(sb, 0);
			return sb.toString();
		}

		public void appendAsString(StringBuilder sb, int indentLevel) {

			if (myInteger != null) {
				sb.append("myInteger: ").append(myInteger);
				return;
			}

			if (myBoolean != null) {
				sb.append("myBoolean: ").append(myBoolean);
				return;
			}

			sb.append("<none>");
		}

	}

	public static class UntaggedChoice2 implements BerType, Serializable {

		private static final long serialVersionUID = 1L;

		public byte[] code = null;
		private BerInteger myInteger = null;
		private BerBoolean myBoolean = null;
		
		public UntaggedChoice2() {
		}

		public UntaggedChoice2(byte[] code) {
			this.code = code;
		}

		public void setMyInteger(BerInteger myInteger) {
			this.myInteger = myInteger;
		}

		public BerInteger getMyInteger() {
			return myInteger;
		}

		public void setMyBoolean(BerBoolean myBoolean) {
			this.myBoolean = myBoolean;
		}

		public BerBoolean getMyBoolean() {
			return myBoolean;
		}

		public int encode(OutputStream reverseOS) throws IOException {

			if (code != null) {
				for (int i = code.length - 1; i >= 0; i--) {
					reverseOS.write(code[i]);
				}
				return code.length;
			}

			int codeLength = 0;
			if (myBoolean != null) {
				codeLength += myBoolean.encode(reverseOS, false);
				// write tag: CONTEXT_CLASS, PRIMITIVE, 9
				reverseOS.write(0x89);
				codeLength += 1;
				return codeLength;
			}
			
			if (myInteger != null) {
				codeLength += myInteger.encode(reverseOS, false);
				// write tag: CONTEXT_CLASS, PRIMITIVE, 8
				reverseOS.write(0x88);
				codeLength += 1;
				return codeLength;
			}
			
			throw new IOException("Error encoding CHOICE: No element of CHOICE was selected.");
		}

		public int decode(InputStream is) throws IOException {
			return decode(is, null);
		}

		public int decode(InputStream is, BerTag berTag) throws IOException {

			int codeLength = 0;
			BerTag passedTag = berTag;

			if (berTag == null) {
				berTag = new BerTag();
				codeLength += berTag.decode(is);
			}

			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 8)) {
				myInteger = new BerInteger();
				codeLength += myInteger.decode(is, false);
				return codeLength;
			}

			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 9)) {
				myBoolean = new BerBoolean();
				codeLength += myBoolean.decode(is, false);
				return codeLength;
			}

			if (passedTag != null) {
				return 0;
			}

			throw new IOException("Error decoding CHOICE: Tag " + berTag + " matched to no item.");
		}

		public void encodeAndSave(int encodingSizeGuess) throws IOException {
			ReverseByteArrayOutputStream reverseOS = new ReverseByteArrayOutputStream(encodingSizeGuess);
			encode(reverseOS);
			code = reverseOS.getArray();
		}

		public String toString() {
			StringBuilder sb = new StringBuilder();
			appendAsString(sb, 0);
			return sb.toString();
		}

		public void appendAsString(StringBuilder sb, int indentLevel) {

			if (myInteger != null) {
				sb.append("myInteger: ").append(myInteger);
				return;
			}

			if (myBoolean != null) {
				sb.append("myBoolean: ").append(myBoolean);
				return;
			}

			sb.append("<none>");
		}

	}

	private BerInteger untaggedInt = null;
	private BerInteger explicitlyTaggedInt = null;
	private BerInteger implicitlyTaggedInt = null;
	private UntaggedChoice untaggedChoice = null;
	private TaggedChoice taggedChoice = null;
	private BerAny taggedAny = null;
	private UntaggedChoice2 untaggedChoice2 = null;
	
	public ChoiceOfDirectTypes() {
	}

	public ChoiceOfDirectTypes(byte[] code) {
		this.code = code;
	}

	public void setUntaggedInt(BerInteger untaggedInt) {
		this.untaggedInt = untaggedInt;
	}

	public BerInteger getUntaggedInt() {
		return untaggedInt;
	}

	public void setExplicitlyTaggedInt(BerInteger explicitlyTaggedInt) {
		this.explicitlyTaggedInt = explicitlyTaggedInt;
	}

	public BerInteger getExplicitlyTaggedInt() {
		return explicitlyTaggedInt;
	}

	public void setImplicitlyTaggedInt(BerInteger implicitlyTaggedInt) {
		this.implicitlyTaggedInt = implicitlyTaggedInt;
	}

	public BerInteger getImplicitlyTaggedInt() {
		return implicitlyTaggedInt;
	}

	public void setUntaggedChoice(UntaggedChoice untaggedChoice) {
		this.untaggedChoice = untaggedChoice;
	}

	public UntaggedChoice getUntaggedChoice() {
		return untaggedChoice;
	}

	public void setTaggedChoice(TaggedChoice taggedChoice) {
		this.taggedChoice = taggedChoice;
	}

	public TaggedChoice getTaggedChoice() {
		return taggedChoice;
	}

	public void setTaggedAny(BerAny taggedAny) {
		this.taggedAny = taggedAny;
	}

	public BerAny getTaggedAny() {
		return taggedAny;
	}

	public void setUntaggedChoice2(UntaggedChoice2 untaggedChoice2) {
		this.untaggedChoice2 = untaggedChoice2;
	}

	public UntaggedChoice2 getUntaggedChoice2() {
		return untaggedChoice2;
	}

	public int encode(OutputStream reverseOS) throws IOException {

		if (code != null) {
			for (int i = code.length - 1; i >= 0; i--) {
				reverseOS.write(code[i]);
			}
			return code.length;
		}

		int codeLength = 0;
		int sublength;

		if (untaggedChoice2 != null) {
			codeLength += untaggedChoice2.encode(reverseOS);
			return codeLength;
		}
		
		if (taggedAny != null) {
			sublength = taggedAny.encode(reverseOS);
			codeLength += sublength;
			codeLength += BerLength.encodeLength(reverseOS, sublength);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 6
			reverseOS.write(0xA6);
			codeLength += 1;
			return codeLength;
		}
		
		if (taggedChoice != null) {
			sublength = taggedChoice.encode(reverseOS);
			codeLength += sublength;
			codeLength += BerLength.encodeLength(reverseOS, sublength);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 5
			reverseOS.write(0xA5);
			codeLength += 1;
			return codeLength;
		}
		
		if (untaggedChoice != null) {
			codeLength += untaggedChoice.encode(reverseOS);
			return codeLength;
		}
		
		if (implicitlyTaggedInt != null) {
			codeLength += implicitlyTaggedInt.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 2
			reverseOS.write(0x82);
			codeLength += 1;
			return codeLength;
		}
		
		if (explicitlyTaggedInt != null) {
			sublength = explicitlyTaggedInt.encode(reverseOS, true);
			codeLength += sublength;
			codeLength += BerLength.encodeLength(reverseOS, sublength);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 1
			reverseOS.write(0xA1);
			codeLength += 1;
			return codeLength;
		}
		
		if (untaggedInt != null) {
			codeLength += untaggedInt.encode(reverseOS, true);
			return codeLength;
		}
		
		throw new IOException("Error encoding CHOICE: No element of CHOICE was selected.");
	}

	public int decode(InputStream is) throws IOException {
		return decode(is, null);
	}

	public int decode(InputStream is, BerTag berTag) throws IOException {

		int codeLength = 0;
		BerTag passedTag = berTag;

		if (berTag == null) {
			berTag = new BerTag();
			codeLength += berTag.decode(is);
		}

		if (berTag.equals(BerInteger.tag)) {
			untaggedInt = new BerInteger();
			codeLength += untaggedInt.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 1)) {
			codeLength += BerLength.skip(is);
			explicitlyTaggedInt = new BerInteger();
			codeLength += explicitlyTaggedInt.decode(is, true);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 2)) {
			implicitlyTaggedInt = new BerInteger();
			codeLength += implicitlyTaggedInt.decode(is, false);
			return codeLength;
		}

		untaggedChoice = new UntaggedChoice();
		int choiceDecodeLength = untaggedChoice.decode(is, berTag);
		if (choiceDecodeLength != 0) {
			return codeLength + choiceDecodeLength;
		}
		else {
			untaggedChoice = null;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 5)) {
			codeLength += BerLength.skip(is);
			taggedChoice = new TaggedChoice();
			codeLength += taggedChoice.decode(is, null);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 6)) {
			codeLength += BerLength.skip(is);
			taggedAny = new BerAny();
			codeLength += taggedAny.decode(is, null);
			return codeLength;
		}

		untaggedChoice2 = new UntaggedChoice2();
		choiceDecodeLength = untaggedChoice2.decode(is, berTag);
		if (choiceDecodeLength != 0) {
			return codeLength + choiceDecodeLength;
		}
		else {
			untaggedChoice2 = null;
		}

		if (passedTag != null) {
			return 0;
		}

		throw new IOException("Error decoding CHOICE: Tag " + berTag + " matched to no item.");
	}

	public void encodeAndSave(int encodingSizeGuess) throws IOException {
		ReverseByteArrayOutputStream reverseOS = new ReverseByteArrayOutputStream(encodingSizeGuess);
		encode(reverseOS);
		code = reverseOS.getArray();
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		appendAsString(sb, 0);
		return sb.toString();
	}

	public void appendAsString(StringBuilder sb, int indentLevel) {

		if (untaggedInt != null) {
			sb.append("untaggedInt: ").append(untaggedInt);
			return;
		}

		if (explicitlyTaggedInt != null) {
			sb.append("explicitlyTaggedInt: ").append(explicitlyTaggedInt);
			return;
		}

		if (implicitlyTaggedInt != null) {
			sb.append("implicitlyTaggedInt: ").append(implicitlyTaggedInt);
			return;
		}

		if (untaggedChoice != null) {
			sb.append("untaggedChoice: ");
			untaggedChoice.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (taggedChoice != null) {
			sb.append("taggedChoice: ");
			taggedChoice.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (taggedAny != null) {
			sb.append("taggedAny: ").append(taggedAny);
			return;
		}

		if (untaggedChoice2 != null) {
			sb.append("untaggedChoice2: ");
			untaggedChoice2.appendAsString(sb, indentLevel + 1);
			return;
		}

		sb.append("<none>");
	}

}

