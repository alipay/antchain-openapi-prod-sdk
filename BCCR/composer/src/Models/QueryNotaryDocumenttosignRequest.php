<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class QueryNotaryDocumenttosignRequest extends Model
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

    // 申请人信息
    /**
     * @var NotaryUser[]
     */
    public $applicantList;

    // 经办人信息
    /**
     * @var NotaryUser
     */
    public $agent;

    // 送达信息
    /**
     * @var ReceiveInfo
     */
    public $receiveInfo;

    // 保全内容
    /**
     * @var string
     */
    public $preservation;

    // 公证处id
    /**
     * @var string
     */
    public $orgId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'applicantList'     => 'applicant_list',
        'agent'             => 'agent',
        'receiveInfo'       => 'receive_info',
        'preservation'      => 'preservation',
        'orgId'             => 'org_id',
    ];

    public function validate()
    {
        Model::validateRequired('applicantList', $this->applicantList, true);
        Model::validateRequired('agent', $this->agent, true);
        Model::validateRequired('receiveInfo', $this->receiveInfo, true);
        Model::validateRequired('preservation', $this->preservation, true);
        Model::validateRequired('orgId', $this->orgId, true);
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
        if (null !== $this->applicantList) {
            $res['applicant_list'] = [];
            if (null !== $this->applicantList && \is_array($this->applicantList)) {
                $n = 0;
                foreach ($this->applicantList as $item) {
                    $res['applicant_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->agent) {
            $res['agent'] = null !== $this->agent ? $this->agent->toMap() : null;
        }
        if (null !== $this->receiveInfo) {
            $res['receive_info'] = null !== $this->receiveInfo ? $this->receiveInfo->toMap() : null;
        }
        if (null !== $this->preservation) {
            $res['preservation'] = $this->preservation;
        }
        if (null !== $this->orgId) {
            $res['org_id'] = $this->orgId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryNotaryDocumenttosignRequest
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
        if (isset($map['applicant_list'])) {
            if (!empty($map['applicant_list'])) {
                $model->applicantList = [];
                $n                    = 0;
                foreach ($map['applicant_list'] as $item) {
                    $model->applicantList[$n++] = null !== $item ? NotaryUser::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['agent'])) {
            $model->agent = NotaryUser::fromMap($map['agent']);
        }
        if (isset($map['receive_info'])) {
            $model->receiveInfo = ReceiveInfo::fromMap($map['receive_info']);
        }
        if (isset($map['preservation'])) {
            $model->preservation = $map['preservation'];
        }
        if (isset($map['org_id'])) {
            $model->orgId = $map['org_id'];
        }

        return $model;
    }
}
