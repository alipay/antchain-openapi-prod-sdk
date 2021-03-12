<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ALiYunChainMiniAppAuthorization extends Model
{
    // ant_chain_id
    /**
     * @example ant_chain_id
     *
     * @var string
     */
    public $antChainId;

    // q_r_code_type
    /**
     * @example q_r_code_type
     *
     * @var string
     */
    public $qRCodeType;

    // authorization_type
    /**
     * @example authorization_type
     *
     * @var string
     */
    public $authorizationType;
    protected $_name = [
        'antChainId'        => 'ant_chain_id',
        'qRCodeType'        => 'q_r_code_type',
        'authorizationType' => 'authorization_type',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->antChainId) {
            $res['ant_chain_id'] = $this->antChainId;
        }
        if (null !== $this->qRCodeType) {
            $res['q_r_code_type'] = $this->qRCodeType;
        }
        if (null !== $this->authorizationType) {
            $res['authorization_type'] = $this->authorizationType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ALiYunChainMiniAppAuthorization
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['ant_chain_id'])) {
            $model->antChainId = $map['ant_chain_id'];
        }
        if (isset($map['q_r_code_type'])) {
            $model->qRCodeType = $map['q_r_code_type'];
        }
        if (isset($map['authorization_type'])) {
            $model->authorizationType = $map['authorization_type'];
        }

        return $model;
    }
}
