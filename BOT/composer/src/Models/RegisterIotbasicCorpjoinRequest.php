<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class RegisterIotbasicCorpjoinRequest extends Model
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

    // 厂商value
    /**
     * @var string
     */
    public $corpCode;

    // 厂商名称
    /**
     * @var string
     */
    public $corpName;

    // 厂商签约产品码
    /**
     * @var string
     */
    public $productCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'corpCode'          => 'corp_code',
        'corpName'          => 'corp_name',
        'productCode'       => 'product_code',
    ];

    public function validate()
    {
        Model::validateRequired('corpCode', $this->corpCode, true);
        Model::validateRequired('corpName', $this->corpName, true);
        Model::validateRequired('productCode', $this->productCode, true);
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
        if (null !== $this->corpCode) {
            $res['corp_code'] = $this->corpCode;
        }
        if (null !== $this->corpName) {
            $res['corp_name'] = $this->corpName;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RegisterIotbasicCorpjoinRequest
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
        if (isset($map['corp_code'])) {
            $model->corpCode = $map['corp_code'];
        }
        if (isset($map['corp_name'])) {
            $model->corpName = $map['corp_name'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }

        return $model;
    }
}
