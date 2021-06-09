<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class MainItemAdd extends Model
{
    // 附加条款代码-参考保司提供样例
    /**
     * @example
     *
     * @var string
     */
    public $mainItemAddCode;

    // 附加条款内容-参考保司提供样例
    /**
     * @example
     *
     * @var string
     */
    public $mainItemAddContent;
    protected $_name = [
        'mainItemAddCode'    => 'main_item_add_code',
        'mainItemAddContent' => 'main_item_add_content',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->mainItemAddCode) {
            $res['main_item_add_code'] = $this->mainItemAddCode;
        }
        if (null !== $this->mainItemAddContent) {
            $res['main_item_add_content'] = $this->mainItemAddContent;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MainItemAdd
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['main_item_add_code'])) {
            $model->mainItemAddCode = $map['main_item_add_code'];
        }
        if (isset($map['main_item_add_content'])) {
            $model->mainItemAddContent = $map['main_item_add_content'];
        }

        return $model;
    }
}
