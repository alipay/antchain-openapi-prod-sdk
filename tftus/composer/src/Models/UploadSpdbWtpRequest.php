<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TFTUS\Models;

use AlibabaCloud\Tea\Model;

class UploadSpdbWtpRequest extends Model
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

    // 请求幂等字段
    /**
     * @var string
     */
    public $requestId;

    // 上传对象名称
    /**
     * @var string
     */
    public $uploadName;

    // 上传信息内容
    /**
     * @var string
     */
    public $uploadMsg;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'requestId'         => 'request_id',
        'uploadName'        => 'upload_name',
        'uploadMsg'         => 'upload_msg',
    ];

    public function validate()
    {
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('uploadName', $this->uploadName, true);
        Model::validateRequired('uploadMsg', $this->uploadMsg, true);
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
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->uploadName) {
            $res['upload_name'] = $this->uploadName;
        }
        if (null !== $this->uploadMsg) {
            $res['upload_msg'] = $this->uploadMsg;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UploadSpdbWtpRequest
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
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['upload_name'])) {
            $model->uploadName = $map['upload_name'];
        }
        if (isset($map['upload_msg'])) {
            $model->uploadMsg = $map['upload_msg'];
        }

        return $model;
    }
}
