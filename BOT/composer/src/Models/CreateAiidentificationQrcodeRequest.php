<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class CreateAiidentificationQrcodeRequest extends Model
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

    // 用户身份标识
    /**
     * @var string
     */
    public $appKey;

    // 二维码生成请求的请求数据
    /**
     * @var BaiQrcodeGenerateReqData
     */
    public $data;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'appKey'            => 'app_key',
        'data'              => 'data',
    ];

    public function validate()
    {
        Model::validateRequired('appKey', $this->appKey, true);
        Model::validateRequired('data', $this->data, true);
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
        if (null !== $this->appKey) {
            $res['app_key'] = $this->appKey;
        }
        if (null !== $this->data) {
            $res['data'] = null !== $this->data ? $this->data->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateAiidentificationQrcodeRequest
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
        if (isset($map['app_key'])) {
            $model->appKey = $map['app_key'];
        }
        if (isset($map['data'])) {
            $model->data = BaiQrcodeGenerateReqData::fromMap($map['data']);
        }

        return $model;
    }
}
