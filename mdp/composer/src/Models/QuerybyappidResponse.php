<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MDP\Models;

use AlibabaCloud\Tea\Model;

class QuerybyappidResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // app_id
    /**
     * @var string
     */
    public $appId;

    // 手机号或者设备号md5
    /**
     * @var string
     */
    public $userId;

    // 分数列表
    /**
     * @var AppIdQualityScoresDONew[]
     */
    public $scores;

    // 筛选分数的规则，通过规则的返回，否则 scores 内容是空的
    /**
     * @var string
     */
    public $rule;

    // 规则对应的 md5 值，用来区分当前规则的版本
    /**
     * @var string
     */
    public $ruleMd5;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'appId'      => 'app_id',
        'userId'     => 'user_id',
        'scores'     => 'scores',
        'rule'       => 'rule',
        'ruleMd5'    => 'rule_md5',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->appId) {
            $res['app_id'] = $this->appId;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->scores) {
            $res['scores'] = [];
            if (null !== $this->scores && \is_array($this->scores)) {
                $n = 0;
                foreach ($this->scores as $item) {
                    $res['scores'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->rule) {
            $res['rule'] = $this->rule;
        }
        if (null !== $this->ruleMd5) {
            $res['rule_md5'] = $this->ruleMd5;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QuerybyappidResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['app_id'])) {
            $model->appId = $map['app_id'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['scores'])) {
            if (!empty($map['scores'])) {
                $model->scores = [];
                $n             = 0;
                foreach ($map['scores'] as $item) {
                    $model->scores[$n++] = null !== $item ? AppIdQualityScoresDONew::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['rule'])) {
            $model->rule = $map['rule'];
        }
        if (isset($map['rule_md5'])) {
            $model->ruleMd5 = $map['rule_md5'];
        }

        return $model;
    }
}
