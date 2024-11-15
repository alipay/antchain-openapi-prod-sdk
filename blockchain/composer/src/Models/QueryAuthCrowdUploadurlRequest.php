<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class QueryAuthCrowdUploadurlRequest extends Model
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

    // 问件类型
    /**
     * @var string
     */
    public $fileType;

    // 业务类型：survey_1（排除问卷三个月人群）；survey_2（排除问卷六个月人群）；recruit_1（排除招募三个月人群）recruit_2（排除招募任务六个月人群）
    /**
     * @var string
     */
    public $bizType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'fileType'          => 'file_type',
        'bizType'           => 'biz_type',
    ];

    public function validate()
    {
        Model::validateRequired('fileType', $this->fileType, true);
        Model::validateRequired('bizType', $this->bizType, true);
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
        if (null !== $this->fileType) {
            $res['file_type'] = $this->fileType;
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAuthCrowdUploadurlRequest
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
        if (isset($map['file_type'])) {
            $model->fileType = $map['file_type'];
        }
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }

        return $model;
    }
}
