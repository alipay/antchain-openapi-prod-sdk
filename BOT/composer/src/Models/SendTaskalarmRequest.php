<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class SendTaskalarmRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 发出告警的任务名称作为租户
    /**
     * @var string
     */
    public $alarmname;

    // 异常类型作为标题
    /**
     * @var string
     */
    public $alarmtitle;

    // 异常的详细描述
    /**
     * @var string
     */
    public $alarmcontent;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'alarmname'         => 'alarmname',
        'alarmtitle'        => 'alarmtitle',
        'alarmcontent'      => 'alarmcontent',
    ];

    public function validate()
    {
        Model::validateRequired('alarmname', $this->alarmname, true);
        Model::validateRequired('alarmtitle', $this->alarmtitle, true);
        Model::validateRequired('alarmcontent', $this->alarmcontent, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->alarmname) {
            $res['alarmname'] = $this->alarmname;
        }
        if (null !== $this->alarmtitle) {
            $res['alarmtitle'] = $this->alarmtitle;
        }
        if (null !== $this->alarmcontent) {
            $res['alarmcontent'] = $this->alarmcontent;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SendTaskalarmRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['alarmname'])) {
            $model->alarmname = $map['alarmname'];
        }
        if (isset($map['alarmtitle'])) {
            $model->alarmtitle = $map['alarmtitle'];
        }
        if (isset($map['alarmcontent'])) {
            $model->alarmcontent = $map['alarmcontent'];
        }

        return $model;
    }
}
