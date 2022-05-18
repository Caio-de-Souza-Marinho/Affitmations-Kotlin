package com.ds.afirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

// adicionando a palavra chave data antes de class transforma em uma classe de dados
data class Affirmation(@StringRes val stringResourceId: Int, @DrawableRes val imageResourceId: Int) {

}