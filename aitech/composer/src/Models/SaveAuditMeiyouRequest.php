<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AITECH\Models;

use AlibabaCloud\Tea\Model;

class SaveAuditMeiyouRequest extends Model
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

    // 美柚待审核信息保存请求
    /**
     * @var MeiyouAuditSaveWebInfo[]
     */
    public $request;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'request'           => 'request',
    ];

    public function validate()
    {
        Model::validateRequired('request', $this->request, true);
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
        if (null !== $this->request) {
            $res['request'] = [];
            if (null !== $this->request && \is_array($this->request)) {
                $n = 0;
                foreach ($this->request as $item) {
                    $res['request'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SaveAuditMeiyouRequest
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
        if (isset($map['request'])) {
            if (!empty($map['request'])) {
                $model->request = [];
                $n              = 0;
                foreach ($map['request'] as $item) {
                    $model->request[$n++] = null !== $item ? MeiyouAuditSaveWebInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
