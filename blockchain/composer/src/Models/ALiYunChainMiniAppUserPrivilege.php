<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ALiYunChainMiniAppUserPrivilege extends Model
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

    // pagination
    /**
     * @example pagination
     *
     * @var ALiYunPagination
     */
    public $pagination;

    // ALiYunChainMiniAppAuthorizedUser
    /**
     * @example ALiYunChainMiniAppAuthorizedUser
     *
     * @var ALiYunChainMiniAppAuthorizedUser[]
     */
    public $authorizedUserList;
    protected $_name = [
        'antChainId'         => 'ant_chain_id',
        'qRCodeType'         => 'q_r_code_type',
        'authorizationType'  => 'authorization_type',
        'pagination'         => 'pagination',
        'authorizedUserList' => 'authorized_user_list',
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
        if (null !== $this->pagination) {
            $res['pagination'] = null !== $this->pagination ? $this->pagination->toMap() : null;
        }
        if (null !== $this->authorizedUserList) {
            $res['authorized_user_list'] = [];
            if (null !== $this->authorizedUserList && \is_array($this->authorizedUserList)) {
                $n = 0;
                foreach ($this->authorizedUserList as $item) {
                    $res['authorized_user_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ALiYunChainMiniAppUserPrivilege
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
        if (isset($map['pagination'])) {
            $model->pagination = ALiYunPagination::fromMap($map['pagination']);
        }
        if (isset($map['authorized_user_list'])) {
            if (!empty($map['authorized_user_list'])) {
                $model->authorizedUserList = [];
                $n                         = 0;
                foreach ($map['authorized_user_list'] as $item) {
                    $model->authorizedUserList[$n++] = null !== $item ? ALiYunChainMiniAppAuthorizedUser::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
