<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class FaceVerifyResultData extends Model
{
    // 请求唯一标识Id
    /**
     * @example 111111111111111
     *
     * @var string
     */
    public $requestId;

    // 认证是否通过
    /**
     * @example T、F 或 null
     *
     * @var string
     */
    public $passed;

    // faceOcclusion:面部遮挡信息；true为有面部遮挡，false为无面部遮挡
    /**
     * @example "{"faceOcclusion":false}"
     *
     * @var string
     */
    public $materialInfo;
    protected $_name = [
        'requestId'    => 'request_id',
        'passed'       => 'passed',
        'materialInfo' => 'material_info',
    ];

    public function validate()
    {
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('passed', $this->passed, true);
        Model::validateRequired('materialInfo', $this->materialInfo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->passed) {
            $res['passed'] = $this->passed;
        }
        if (null !== $this->materialInfo) {
            $res['material_info'] = $this->materialInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FaceVerifyResultData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['passed'])) {
            $model->passed = $map['passed'];
        }
        if (isset($map['material_info'])) {
            $model->materialInfo = $map['material_info'];
        }

        return $model;
    }
}
