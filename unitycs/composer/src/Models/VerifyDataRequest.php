<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\UNITYCS\Models;

use AlibabaCloud\Tea\Model;

class VerifyDataRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 元数据编码
    /**
     * @var string
     */
    public $metadataCode;

    // 数据标识
    /**
     * @var string
     */
    public $attrIdentify;

    // 核验属性集合
    /**
     * @var MetaDataAttr[]
     */
    public $attrs;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'metadataCode'      => 'metadata_code',
        'attrIdentify'      => 'attr_identify',
        'attrs'             => 'attrs',
    ];

    public function validate()
    {
        Model::validateRequired('metadataCode', $this->metadataCode, true);
        Model::validateRequired('attrs', $this->attrs, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->metadataCode) {
            $res['metadata_code'] = $this->metadataCode;
        }
        if (null !== $this->attrIdentify) {
            $res['attr_identify'] = $this->attrIdentify;
        }
        if (null !== $this->attrs) {
            $res['attrs'] = [];
            if (null !== $this->attrs && \is_array($this->attrs)) {
                $n = 0;
                foreach ($this->attrs as $item) {
                    $res['attrs'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VerifyDataRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['metadata_code'])) {
            $model->metadataCode = $map['metadata_code'];
        }
        if (isset($map['attr_identify'])) {
            $model->attrIdentify = $map['attr_identify'];
        }
        if (isset($map['attrs'])) {
            if (!empty($map['attrs'])) {
                $model->attrs = [];
                $n            = 0;
                foreach ($map['attrs'] as $item) {
                    $model->attrs[$n++] = null !== $item ? MetaDataAttr::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
