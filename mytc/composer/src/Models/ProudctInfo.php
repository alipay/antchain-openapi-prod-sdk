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

    // 商品描述
    /**
     * @example 匠心铸造，大师杰作
     *
     * @var string
     */
    public $productDesc;
    protected $_name = [
        'name'          => 'name',
        'proudctImages' => 'proudct_images',
        'productDesc'   => 'product_desc',
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
        if (null !== $this->productDesc) {
            $res['product_desc'] = $this->productDesc;
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
        if (isset($map['product_desc'])) {
            $model->productDesc = $map['product_desc'];
        }

        return $model;
    }
}
