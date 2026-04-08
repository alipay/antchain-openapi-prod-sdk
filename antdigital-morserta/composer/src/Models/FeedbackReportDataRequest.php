<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MORSERTA\Models;

use AlibabaCloud\Tea\Model;

class FeedbackReportDataRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 广告主账号ID
    /**
     * @var string
     */
    public $accountId;

    // 报表类型级别
    /**
     * @var string
     */
    public $level;

    // 回传数据明细，类型json array
    /**
     * @var string
     */
    public $feedbackData;
    protected $_name = [
        'authToken'    => 'auth_token',
        'accountId'    => 'account_id',
        'level'        => 'level',
        'feedbackData' => 'feedback_data',
    ];

    public function validate()
    {
        Model::validateRequired('accountId', $this->accountId, true);
        Model::validateRequired('level', $this->level, true);
        Model::validateRequired('feedbackData', $this->feedbackData, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->level) {
            $res['level'] = $this->level;
        }
        if (null !== $this->feedbackData) {
            $res['feedback_data'] = $this->feedbackData;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FeedbackReportDataRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }
        if (isset($map['level'])) {
            $model->level = $map['level'];
        }
        if (isset($map['feedback_data'])) {
            $model->feedbackData = $map['feedback_data'];
        }

        return $model;
    }
}
