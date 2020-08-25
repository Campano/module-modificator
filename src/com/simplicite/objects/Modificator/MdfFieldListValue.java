package com.simplicite.objects.Modificator;

import java.util.*;
import com.simplicite.util.*;
import com.simplicite.util.tools.*;
import com.simplicite.objects.System.FieldListValue;
import com.simplicite.commons.Modificator.MdfTool;
/**
 * Business object MdfFieldListValue
 */
public class MdfFieldListValue extends FieldListValue {
	private static final long serialVersionUID = 1L;
	
	@Override
	public void postLoad() {
		setDefaultSearchSpec(MdfTool.getMdfSearchSpec(getGrant()));
		super.postLoad();
	}
	
	@Override
	public String postUpdate() {
		return Message.formatWarning("MDF_WARN_NOTIFY", null, null);
	}	
}
