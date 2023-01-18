<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MYTC\Models;

use AlibabaCloud\Tea\Model;

class ProudctInfo extends Model
{
    // 商品名称
    /**
     * @example 爆款鞋子
     *
     * @var string
     */
    public $name;

    // 商品图片链接列表
    /**
     * @example
     *
     * @var string[]
     */
    public $proudctImages;
    protected $_name = [
        'name'          => 'name',
        'proudctImages' => 'proudct_images',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->proudctImages) {
            $res['proudct_images'] = $this->proudctImages;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ProudctInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['proudct_images'])) {
            if (!empty($map['proudct_images'])) {
                $model->proudctImages = $map['proudct_images'];
            }
        }

        return $model;
    }
}
