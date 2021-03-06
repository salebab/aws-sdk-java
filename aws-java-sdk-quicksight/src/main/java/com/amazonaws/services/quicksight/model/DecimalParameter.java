/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Decimal parameter.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DecimalParameter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DecimalParameter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A display name for the dataset.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Values.
     * </p>
     */
    private java.util.List<Double> values;

    /**
     * <p>
     * A display name for the dataset.
     * </p>
     * 
     * @param name
     *        A display name for the dataset.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A display name for the dataset.
     * </p>
     * 
     * @return A display name for the dataset.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A display name for the dataset.
     * </p>
     * 
     * @param name
     *        A display name for the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DecimalParameter withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Values.
     * </p>
     * 
     * @return Values.
     */

    public java.util.List<Double> getValues() {
        return values;
    }

    /**
     * <p>
     * Values.
     * </p>
     * 
     * @param values
     *        Values.
     */

    public void setValues(java.util.Collection<Double> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<Double>(values);
    }

    /**
     * <p>
     * Values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        Values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DecimalParameter withValues(Double... values) {
        if (this.values == null) {
            setValues(new java.util.ArrayList<Double>(values.length));
        }
        for (Double ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Values.
     * </p>
     * 
     * @param values
     *        Values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DecimalParameter withValues(java.util.Collection<Double> values) {
        setValues(values);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getValues() != null)
            sb.append("Values: ").append(getValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DecimalParameter == false)
            return false;
        DecimalParameter other = (DecimalParameter) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public DecimalParameter clone() {
        try {
            return (DecimalParameter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.DecimalParameterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
