<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class AuthRecordListResponse extends Model
{
    // 授权请求id
    /**
     * @example -
     *
     * @var string
     */
    public $requestId;

    // 授权用户did
    /**
     * @example -
     *
     * @var string
     */
    public $userDid;

    // 授权用户信息
    /**
     * @example {"name":"zhangsan","certNo":"42xx1234"}
     *
     * @var string
     */
    public $userInfo;

    // 授权内容
    /**
     * @example 社保
     *
     * @var AuthContent
     */
    public $authContent;

    // 授权结果
    /**
     * @example true, false
     *
     * @var bool
     */
    public $authResult;

    // 授权请求时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $requestTime;

    // 协议列表
    /**
     * @example
     *
     * @var Agreement[]
     */
    public $agreementList;
    protected $_name = [
        'requestId'     => 'request_id',
        'userDid'       => 'user_did',
        'userInfo'      => 'user_info',
        'authContent'   => 'auth_content',
        'authResult'    => 'auth_result',
        'requestTime'   => 'request_time',
        'agreementList' => 'agreement_list',
    ];

    public function validate()
    {
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('userDid', $this->userDid, true);
        Model::validateRequired('userInfo', $this->userInfo, true);
        Model::validateRequired('authContent', $this->authContent, true);
        Model::validateRequired('authResult', $this->authResult, true);
        Model::validateRequired('requestTime', $this->requestTime, true);
        Model::validateRequired('agreementList', $this->agreementList, true);
        Model::validatePattern('requestTime', $this->requestTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->userDid) {
            $res['user_did'] = $this->userDid;
        }
        if (null !== $this->userInfo) {
            $res['user_info'] = $this->userInfo;
        }
        if (null !== $this->authContent) {
            $res['auth_content'] = null !== $this->authContent ? $this->authContent->toMap() : null;
        }
        if (null !== $this->authResult) {
            $res['auth_result'] = $this->authResult;
        }
        if (null !== $this->requestTime) {
            $res['request_time'] = $this->requestTime;
        }
        if (null !== $this->agreementList) {
            $res['agreement_list'] = [];
            if (null !== $this->agreementList && \is_array($this->agreementList)) {
                $n = 0;
                foreach ($this->agreementList as $item) {
                    $res['agreement_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AuthRecordListResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['user_did'])) {
            $model->userDid = $map['user_did'];
        }
        if (isset($map['user_info'])) {
            $model->userInfo = $map['user_info'];
        }
        if (isset($map['auth_content'])) {
            $model->authContent = AuthContent::fromMap($map['auth_content']);
        }
        if (isset($map['auth_result'])) {
            $model->authResult = $map['auth_result'];
        }
        if (isset($map['request_time'])) {
            $model->requestTime = $map['request_time'];
        }
        if (isset($map['agreement_list'])) {
            if (!empty($map['agreement_list'])) {
                $model->agreementList = [];
                $n                    = 0;
                foreach ($map['agreement_list'] as $item) {
                    $model->agreementList[$n++] = null !== $item ? Agreement::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
