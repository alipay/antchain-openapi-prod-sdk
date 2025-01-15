<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MARKETING\Models;

use AlibabaCloud\Tea\Model;

class SubmitActivityInformationRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 活动标识
    /**
     * @var string
     */
    public $activityId;

    // 渠道编码
    /**
     * @var string
     */
    public $activityChannel;

    // 活动表单
    /**
     * @var string
     */
    public $activityFormData;

    // 提交时间，ISO_DATE_TIME 时间格式
    /**
     * @var string
     */
    public $submitDate;

    // 情报标识，存在则更新
    /**
     * @var string
     */
    public $informationId;

    // 可选附件
    /**
     * @var Attachment[]
     */
    public $attachments;
    protected $_name = [
        'authToken'        => 'auth_token',
        'activityId'       => 'activity_id',
        'activityChannel'  => 'activity_channel',
        'activityFormData' => 'activity_form_data',
        'submitDate'       => 'submit_date',
        'informationId'    => 'information_id',
        'attachments'      => 'attachments',
    ];

    public function validate()
    {
        Model::validateRequired('activityId', $this->activityId, true);
        Model::validateRequired('activityChannel', $this->activityChannel, true);
        Model::validateRequired('activityFormData', $this->activityFormData, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->activityId) {
            $res['activity_id'] = $this->activityId;
        }
        if (null !== $this->activityChannel) {
            $res['activity_channel'] = $this->activityChannel;
        }
        if (null !== $this->activityFormData) {
            $res['activity_form_data'] = $this->activityFormData;
        }
        if (null !== $this->submitDate) {
            $res['submit_date'] = $this->submitDate;
        }
        if (null !== $this->informationId) {
            $res['information_id'] = $this->informationId;
        }
        if (null !== $this->attachments) {
            $res['attachments'] = [];
            if (null !== $this->attachments && \is_array($this->attachments)) {
                $n = 0;
                foreach ($this->attachments as $item) {
                    $res['attachments'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubmitActivityInformationRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['activity_id'])) {
            $model->activityId = $map['activity_id'];
        }
        if (isset($map['activity_channel'])) {
            $model->activityChannel = $map['activity_channel'];
        }
        if (isset($map['activity_form_data'])) {
            $model->activityFormData = $map['activity_form_data'];
        }
        if (isset($map['submit_date'])) {
            $model->submitDate = $map['submit_date'];
        }
        if (isset($map['information_id'])) {
            $model->informationId = $map['information_id'];
        }
        if (isset($map['attachments'])) {
            if (!empty($map['attachments'])) {
                $model->attachments = [];
                $n                  = 0;
                foreach ($map['attachments'] as $item) {
                    $model->attachments[$n++] = null !== $item ? Attachment::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
