<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\HK_SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class HitResults extends Model
{
    // Reason for the screening decision. See more details in API-specific result codes.
    /**
     * @example AML_CLEAN
     *
     * @var string
     */
    public $resultCode;

    // Result status. Possible values and their meanings are as below:
    //
    // "S": successful
    //
    // "F": failed
    //
    // "U": unknown issue
    /**
     * @example S
     *
     * @var string
     */
    public $resultStatus;

    // Result message.
    //
    // See more details in API-specific result codes.
    /**
     * @example No hit found.
     *
     * @var string
     */
    public $resultMessage;
    protected $_name = [
        'resultCode'    => 'result_code',
        'resultStatus'  => 'result_status',
        'resultMessage' => 'result_message',
    ];

    public function validate()
    {
        Model::validateRequired('resultCode', $this->resultCode, true);
        Model::validateRequired('resultStatus', $this->resultStatus, true);
        Model::validateRequired('resultMessage', $this->resultMessage, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultStatus) {
            $res['result_status'] = $this->resultStatus;
        }
        if (null !== $this->resultMessage) {
            $res['result_message'] = $this->resultMessage;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return HitResults
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_status'])) {
            $model->resultStatus = $map['result_status'];
        }
        if (isset($map['result_message'])) {
            $model->resultMessage = $map['result_message'];
        }

        return $model;
    }
}
