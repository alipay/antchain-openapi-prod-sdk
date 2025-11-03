<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AITECH\Models;

use AlibabaCloud\Tea\Model;

class SubmitAuditMeiyouRequest extends Model
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

    // 数据来源
    /**
     * @var string
     */
    public $source;

    // 美柚审核信息存储请求
    /**
     * @var MeiyouAuditSaveWebRequest[]
     */
    public $saveInfo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'source'            => 'source',
        'saveInfo'          => 'save_info',
    ];

    public function validate()
    {
        Model::validateRequired('source', $this->source, true);
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
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->saveInfo) {
            $res['save_info'] = [];
            if (null !== $this->saveInfo && \is_array($this->saveInfo)) {
                $n = 0;
                foreach ($this->saveInfo as $item) {
                    $res['save_info'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubmitAuditMeiyouRequest
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
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }
        if (isset($map['save_info'])) {
            if (!empty($map['save_info'])) {
                $model->saveInfo = [];
                $n               = 0;
                foreach ($map['save_info'] as $item) {
                    $model->saveInfo[$n++] = null !== $item ? MeiyouAuditSaveWebRequest::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
