<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ApplicationQueryReq extends Model
{
    // 应用程序ID
    /**
     * @example app20230725115808679d4f
     *
     * @var string
     */
    public $applicationId;
    protected $_name = [
        'applicationId' => 'application_id',
    ];

    public function validate()
    {
        Model::validateRequired('applicationId', $this->applicationId, true);
        Model::validateMaxLength('applicationId', $this->applicationId, 64);
        Model::validateMinLength('applicationId', $this->applicationId, 1);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->applicationId) {
            $res['application_id'] = $this->applicationId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplicationQueryReq
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['application_id'])) {
            $model->applicationId = $map['application_id'];
        }

        return $model;
    }
}
