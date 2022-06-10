<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BBP\Models;

use AlibabaCloud\Tea\Model;

class UploadStaffAssessmentRequest extends Model
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

    // 请求时间
    /**
     * @var int
     */
    public $timeStamp;

    // 考核信息
    /**
     * @var Assessment
     */
    public $assessment;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'timeStamp'         => 'time_stamp',
        'assessment'        => 'assessment',
    ];

    public function validate()
    {
        Model::validateRequired('timeStamp', $this->timeStamp, true);
        Model::validateRequired('assessment', $this->assessment, true);
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
        if (null !== $this->timeStamp) {
            $res['time_stamp'] = $this->timeStamp;
        }
        if (null !== $this->assessment) {
            $res['assessment'] = null !== $this->assessment ? $this->assessment->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UploadStaffAssessmentRequest
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
        if (isset($map['time_stamp'])) {
            $model->timeStamp = $map['time_stamp'];
        }
        if (isset($map['assessment'])) {
            $model->assessment = Assessment::fromMap($map['assessment']);
        }

        return $model;
    }
}
