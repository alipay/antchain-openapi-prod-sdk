<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class QueryDataauthorizationParticipantRequest extends Model
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

    // 参与方ID
    /**
     * @var string
     */
    public $participantId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'participantId'     => 'participant_id',
    ];

    public function validate()
    {
        Model::validateRequired('participantId', $this->participantId, true);
        Model::validateMaxLength('participantId', $this->participantId, 100);
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
        if (null !== $this->participantId) {
            $res['participant_id'] = $this->participantId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDataauthorizationParticipantRequest
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
        if (isset($map['participant_id'])) {
            $model->participantId = $map['participant_id'];
        }

        return $model;
    }
}
