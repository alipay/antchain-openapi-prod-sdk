<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAX\Models;

use AlibabaCloud\Tea\Model;

class ForgetMeta extends Model
{
    // 字段名称
    /**
     * @example 字段名称 例如：密码
     *
     * @var string
     */
    public $label;

    // 忘记密码的链接地址，供重置用
    /**
     * @example www.baidu.com
     *
     * @var string
     */
    public $link;
    protected $_name = [
        'label' => 'label',
        'link'  => 'link',
    ];

    public function validate()
    {
        Model::validateRequired('label', $this->label, true);
        Model::validateRequired('link', $this->link, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->label) {
            $res['label'] = $this->label;
        }
        if (null !== $this->link) {
            $res['link'] = $this->link;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ForgetMeta
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['label'])) {
            $model->label = $map['label'];
        }
        if (isset($map['link'])) {
            $model->link = $map['link'];
        }

        return $model;
    }
}
