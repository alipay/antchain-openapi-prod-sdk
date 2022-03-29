<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\OP\Models;

use AlibabaCloud\Tea\Model;

class ResultCode extends Model
{
    // meta数据id
    /**
     * @example 0000000193
     *
     * @var string
     */
    public $apiMetaId;

    // api版本id
    /**
     * @example 0000000194
     *
     * @var string
     */
    public $apiVersionId;

    // 结果码
    /**
     * @example 200
     *
     * @var string
     */
    public $internalCode;

    // 外部结果码
    /**
     * @example 200
     *
     * @var string
     */
    public $code;

    // 返回结果描述
    /**
     * @example ERROR
     *
     * @var string
     */
    public $description;

    // 解决错误办法
    /**
     * @example ERROR
     *
     * @var string
     */
    public $resolution;
    protected $_name = [
        'apiMetaId'    => 'api_meta_id',
        'apiVersionId' => 'api_version_id',
        'internalCode' => 'internal_code',
        'code'         => 'code',
        'description'  => 'description',
        'resolution'   => 'resolution',
    ];

    public function validate()
    {
        Model::validateRequired('apiMetaId', $this->apiMetaId, true);
        Model::validateRequired('apiVersionId', $this->apiVersionId, true);
        Model::validateRequired('internalCode', $this->internalCode, true);
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('resolution', $this->resolution, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->apiMetaId) {
            $res['api_meta_id'] = $this->apiMetaId;
        }
        if (null !== $this->apiVersionId) {
            $res['api_version_id'] = $this->apiVersionId;
        }
        if (null !== $this->internalCode) {
            $res['internal_code'] = $this->internalCode;
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->resolution) {
            $res['resolution'] = $this->resolution;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ResultCode
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['api_meta_id'])) {
            $model->apiMetaId = $map['api_meta_id'];
        }
        if (isset($map['api_version_id'])) {
            $model->apiVersionId = $map['api_version_id'];
        }
        if (isset($map['internal_code'])) {
            $model->internalCode = $map['internal_code'];
        }
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['resolution'])) {
            $model->resolution = $map['resolution'];
        }

        return $model;
    }
}
