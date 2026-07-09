<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class ImportIotlinkThingmodeltslRequest extends Model
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

    // 品类code
    /**
     * @var string
     */
    public $categoryCode;

    // 您编辑的物模型（TSL）。JSON格式的字符串。产品的物模型（TSL）包含属性、服务和事件的定义。
    /**
     * @var string
     */
    public $tslStr;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'categoryCode'      => 'category_code',
        'tslStr'            => 'tsl_str',
    ];

    public function validate()
    {
        Model::validateRequired('categoryCode', $this->categoryCode, true);
        Model::validateRequired('tslStr', $this->tslStr, true);
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
        if (null !== $this->categoryCode) {
            $res['category_code'] = $this->categoryCode;
        }
        if (null !== $this->tslStr) {
            $res['tsl_str'] = $this->tslStr;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ImportIotlinkThingmodeltslRequest
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
        if (isset($map['category_code'])) {
            $model->categoryCode = $map['category_code'];
        }
        if (isset($map['tsl_str'])) {
            $model->tslStr = $map['tsl_str'];
        }

        return $model;
    }
}
