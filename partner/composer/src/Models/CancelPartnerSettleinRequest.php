<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PARTNER\Models;

use AlibabaCloud\Tea\Model;

class CancelPartnerSettleinRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 租户来源-用于租户隔离
    /**
     * @var string
     */
    public $source;

    // 入驻申请id
    /**
     * @var int
     */
    public $applyId;
    protected $_name = [
        'authToken' => 'auth_token',
        'source'    => 'source',
        'applyId'   => 'apply_id',
    ];

    public function validate()
    {
        Model::validateRequired('source', $this->source, true);
        Model::validateRequired('applyId', $this->applyId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->applyId) {
            $res['apply_id'] = $this->applyId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CancelPartnerSettleinRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }
        if (isset($map['apply_id'])) {
            $model->applyId = $map['apply_id'];
        }

        return $model;
    }
}
