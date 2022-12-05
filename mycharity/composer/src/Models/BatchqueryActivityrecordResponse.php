<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MYCHARITY\Models;

use AlibabaCloud\Tea\Model;

class BatchqueryActivityrecordResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 用户活动徽章捐赠记录集合
    /**
     * @var ActivityRecordVO[]
     */
    public $activityRecordList;
    protected $_name = [
        'reqMsgId'           => 'req_msg_id',
        'resultCode'         => 'result_code',
        'resultMsg'          => 'result_msg',
        'activityRecordList' => 'activity_record_list',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->activityRecordList) {
            $res['activity_record_list'] = [];
            if (null !== $this->activityRecordList && \is_array($this->activityRecordList)) {
                $n = 0;
                foreach ($this->activityRecordList as $item) {
                    $res['activity_record_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchqueryActivityrecordResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['activity_record_list'])) {
            if (!empty($map['activity_record_list'])) {
                $model->activityRecordList = [];
                $n                         = 0;
                foreach ($map['activity_record_list'] as $item) {
                    $model->activityRecordList[$n++] = null !== $item ? ActivityRecordVO::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
