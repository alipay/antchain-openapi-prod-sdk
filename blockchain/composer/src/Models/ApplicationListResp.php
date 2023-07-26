<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ApplicationListResp extends Model
{
    // 应用程序ID
    /**
     * @example app20230725115808679d4f
     *
     * @var string
     */
    public $applicationId;

    // 链ID
    /**
     * @example 284f75bc-8069-443f-9d46-4576bb15f210
     *
     * @var string
     */
    public $accessKey;

    // 合约(创建实例时填写的合约名称。)
    /**
     * @example
     *
     * @var string[]
     */
    public $nameList;
    protected $_name = [
        'applicationId' => 'application_id',
        'accessKey'     => 'access_key',
        'nameList'      => 'name_list',
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
        if (null !== $this->accessKey) {
            $res['access_key'] = $this->accessKey;
        }
        if (null !== $this->nameList) {
            $res['name_list'] = $this->nameList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplicationListResp
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['application_id'])) {
            $model->applicationId = $map['application_id'];
        }
        if (isset($map['access_key'])) {
            $model->accessKey = $map['access_key'];
        }
        if (isset($map['name_list'])) {
            if (!empty($map['name_list'])) {
                $model->nameList = $map['name_list'];
            }
        }

        return $model;
    }
}
