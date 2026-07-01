<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CaSystemMainBodyRequest extends Model
{
    // 正文章模式坐标ABSOLUTE_POSITION, 关键字KEY_WORD
    /**
     * @example ABSOLUTE_POSITION, KEY_WORD
     *
     * @var string
     */
    public $mainBodyModel;

    // 签署页码
    /**
     * @example
     *
     * @var int
     */
    public $posPage;

    // 签署区位置横坐标;mainBodyModel为ABSOLUTE_POSITION时必填
    /**
     * @example
     *
     * @var int
     */
    public $posX;

    // 签署区位置纵坐标;mainBodyModel为ABSOLUTE_POSITION时必填
    /**
     * @example
     *
     * @var int
     */
    public $posY;

    // 关键字：mainBodyModel为KEY_WORD时必填
    /**
     * @example 关键字
     *
     * @var string
     */
    public $keyWord;

    // mainBodyModel为KEY_WORD时必填
    /**
     * @example 关键字类型
     *
     * @var int
     */
    public $keyWordType;

    // 第几个关键字;mainBodyModel为KEY_WORD时必填
    /**
     * @example 1
     *
     * @var int
     */
    public $kwIndex;

    // x偏移量
    /**
     * @example
     *
     * @var int
     */
    public $kwShiftX;

    // y偏移量
    /**
     * @example
     *
     * @var int
     */
    public $kwShiftY;
    protected $_name = [
        'mainBodyModel' => 'main_body_model',
        'posPage'       => 'pos_page',
        'posX'          => 'pos_x',
        'posY'          => 'pos_y',
        'keyWord'       => 'key_word',
        'keyWordType'   => 'key_word_type',
        'kwIndex'       => 'kw_index',
        'kwShiftX'      => 'kw_shift_x',
        'kwShiftY'      => 'kw_shift_y',
    ];

    public function validate()
    {
        Model::validateRequired('mainBodyModel', $this->mainBodyModel, true);
        Model::validateRequired('posPage', $this->posPage, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->mainBodyModel) {
            $res['main_body_model'] = $this->mainBodyModel;
        }
        if (null !== $this->posPage) {
            $res['pos_page'] = $this->posPage;
        }
        if (null !== $this->posX) {
            $res['pos_x'] = $this->posX;
        }
        if (null !== $this->posY) {
            $res['pos_y'] = $this->posY;
        }
        if (null !== $this->keyWord) {
            $res['key_word'] = $this->keyWord;
        }
        if (null !== $this->keyWordType) {
            $res['key_word_type'] = $this->keyWordType;
        }
        if (null !== $this->kwIndex) {
            $res['kw_index'] = $this->kwIndex;
        }
        if (null !== $this->kwShiftX) {
            $res['kw_shift_x'] = $this->kwShiftX;
        }
        if (null !== $this->kwShiftY) {
            $res['kw_shift_y'] = $this->kwShiftY;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CaSystemMainBodyRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['main_body_model'])) {
            $model->mainBodyModel = $map['main_body_model'];
        }
        if (isset($map['pos_page'])) {
            $model->posPage = $map['pos_page'];
        }
        if (isset($map['pos_x'])) {
            $model->posX = $map['pos_x'];
        }
        if (isset($map['pos_y'])) {
            $model->posY = $map['pos_y'];
        }
        if (isset($map['key_word'])) {
            $model->keyWord = $map['key_word'];
        }
        if (isset($map['key_word_type'])) {
            $model->keyWordType = $map['key_word_type'];
        }
        if (isset($map['kw_index'])) {
            $model->kwIndex = $map['kw_index'];
        }
        if (isset($map['kw_shift_x'])) {
            $model->kwShiftX = $map['kw_shift_x'];
        }
        if (isset($map['kw_shift_y'])) {
            $model->kwShiftY = $map['kw_shift_y'];
        }

        return $model;
    }
}
