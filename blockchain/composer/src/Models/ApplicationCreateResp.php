<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ApplicationCreateResp extends Model
{
    // 应用标识
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
     * @return ApplicationCreateResp
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
