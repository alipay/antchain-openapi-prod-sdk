<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTX\Models;

use AlibabaCloud\Tea\Model;

class TransactionsParticipator extends Model
{
    // app_name
    /**
     * @example app_name
     *
     * @var string
     */
    public $appName;

    // id
    /**
     * @example 1
     *
     * @var string
     */
    public $id;

    // method_name
    /**
     * @example ;
     *
     * @var string
     */
    public $methodName;

    // method_type
    /**
     * @example method_type
     *
     * @var string
     */
    public $methodType;

    // rsDesc
    /**
     * @example rsDesc
     *
     * @var string
     */
    public $rsDesc;

    // rs_type
    /**
     * @example 1
     *
     * @var string
     */
    public $rsType;
    protected $_name = [
        'appName'    => 'app_name',
        'id'         => 'id',
        'methodName' => 'method_name',
        'methodType' => 'method_type',
        'rsDesc'     => 'rs_desc',
        'rsType'     => 'rs_type',
    ];

    public function validate()
    {
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('methodName', $this->methodName, true);
        Model::validateRequired('methodType', $this->methodType, true);
        Model::validateRequired('rsDesc', $this->rsDesc, true);
        Model::validateRequired('rsType', $this->rsType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->methodName) {
            $res['method_name'] = $this->methodName;
        }
        if (null !== $this->methodType) {
            $res['method_type'] = $this->methodType;
        }
        if (null !== $this->rsDesc) {
            $res['rs_desc'] = $this->rsDesc;
        }
        if (null !== $this->rsType) {
            $res['rs_type'] = $this->rsType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TransactionsParticipator
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['method_name'])) {
            $model->methodName = $map['method_name'];
        }
        if (isset($map['method_type'])) {
            $model->methodType = $map['method_type'];
        }
        if (isset($map['rs_desc'])) {
            $model->rsDesc = $map['rs_desc'];
        }
        if (isset($map['rs_type'])) {
            $model->rsType = $map['rs_type'];
        }

        return $model;
    }
}
