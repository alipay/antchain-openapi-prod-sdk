<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDIGITAL\Models;

use AlibabaCloud\Tea\Model;

class CreateResourcePolicyRequest extends Model
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

    // 链ID
    /**
     * @var string
     */
    public $bizid;

    // 上传文件名，实际服务端文件名称会使用随机字符串，这里需上传指定后缀的文件
    /**
     * @var string
     */
    public $fileName;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizid'             => 'bizid',
        'fileName'          => 'file_name',
    ];

    public function validate()
    {
        Model::validateRequired('bizid', $this->bizid, true);
        Model::validateRequired('fileName', $this->fileName, true);
        Model::validateMinLength('bizid', $this->bizid, 1);
        Model::validateMinLength('fileName', $this->fileName, 1);
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
        if (null !== $this->bizid) {
            $res['bizid'] = $this->bizid;
        }
        if (null !== $this->fileName) {
            $res['file_name'] = $this->fileName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateResourcePolicyRequest
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
        if (isset($map['bizid'])) {
            $model->bizid = $map['bizid'];
        }
        if (isset($map['file_name'])) {
            $model->fileName = $map['file_name'];
        }

        return $model;
    }
}
