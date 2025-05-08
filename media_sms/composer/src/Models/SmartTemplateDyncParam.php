<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MEDIA_SMS\Models;

use AlibabaCloud\Tea\Model;

class SmartTemplateDyncParam extends Model
{
    // 可以用该字段关联短链的发送目标
    /**
     * @example 132XXXXXXXX
     *
     * @var string
     */
    public $custFlag;

    // json字符串
    // {"param1":"123","param2":"100"}
    /**
     * @example {"param1":"123","param2":"100"}
     *
     * @var string
     */
    public $dyncParams;
    protected $_name = [
        'custFlag'   => 'cust_flag',
        'dyncParams' => 'dync_params',
    ];

    public function validate()
    {
        Model::validateRequired('custFlag', $this->custFlag, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->custFlag) {
            $res['cust_flag'] = $this->custFlag;
        }
        if (null !== $this->dyncParams) {
            $res['dync_params'] = $this->dyncParams;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SmartTemplateDyncParam
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cust_flag'])) {
            $model->custFlag = $map['cust_flag'];
        }
        if (isset($map['dync_params'])) {
            $model->dyncParams = $map['dync_params'];
        }

        return $model;
    }
}
