<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class QueryScreenshotRequest extends Model
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

    // 取证id
    /**
     * @var string
     */
    public $evidenceId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'evidenceId'        => 'evidence_id',
    ];

    public function validate()
    {
        Model::validateRequired('evidenceId', $this->evidenceId, true);
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
        if (null !== $this->evidenceId) {
            $res['evidence_id'] = $this->evidenceId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryScreenshotRequest
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
        if (isset($map['evidence_id'])) {
            $model->evidenceId = $map['evidence_id'];
        }

        return $model;
    }
}
