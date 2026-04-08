<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MORSERTA\Models;

use AlibabaCloud\Tea\Model;

class DataAdDataExportExperimentRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 广告主账户为数字，如“9471147”
    /**
     * @var string
     */
    public $accountId;

    // 开始时间 yyyyMMdd
    /**
     * @var string
     */
    public $startDay;

    // 结束时间 yyyyMMdd
    /**
     * @var string
     */
    public $endDay;
    protected $_name = [
        'authToken' => 'auth_token',
        'accountId' => 'account_id',
        'startDay'  => 'start_day',
        'endDay'    => 'end_day',
    ];

    public function validate()
    {
        Model::validateRequired('accountId', $this->accountId, true);
        Model::validateRequired('startDay', $this->startDay, true);
        Model::validateRequired('endDay', $this->endDay, true);
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
        if (null !== $this->startDay) {
            $res['start_day'] = $this->startDay;
        }
        if (null !== $this->endDay) {
            $res['end_day'] = $this->endDay;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DataAdDataExportExperimentRequest
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
        if (isset($map['start_day'])) {
            $model->startDay = $map['start_day'];
        }
        if (isset($map['end_day'])) {
            $model->endDay = $map['end_day'];
        }

        return $model;
    }
}
