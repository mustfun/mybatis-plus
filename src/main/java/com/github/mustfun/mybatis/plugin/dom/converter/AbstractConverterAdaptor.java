package com.github.mustfun.mybatis.plugin.dom.converter;

import com.intellij.util.xml.ConvertContext;
import com.intellij.util.xml.ResolvingConverter;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

import org.apache.commons.lang.StringUtils;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * 继承 ResolvingConverter ，getVariants方法就是候选项 实现Converter 接口，能将任意对象转为string,或相反
 * @author yanglin
 */
public abstract class AbstractConverterAdaptor<T> extends ResolvingConverter<T> {

    @NotNull
    @Override
    public Collection<? extends T> getVariants(ConvertContext context) {
        return Collections.emptyList();
    }

    /**
     * 跟上面不同的是，加在这个候选项里面，就不会标记为语法错误
     * @param context
     * @return
     */
    @NotNull
    @Override
    public Set<String> getAdditionalVariants(@NotNull ConvertContext context) {
        return super.getAdditionalVariants(context);
    }

    @Nullable
    @Override
    public String toString(@Nullable T t, ConvertContext context) {
        //throw new UnsupportedOperationException();
        return null;
    }

    @Nullable
    @Override
    public T fromString(@Nullable @NonNls String s, ConvertContext context) {
        return null;
    }
}
