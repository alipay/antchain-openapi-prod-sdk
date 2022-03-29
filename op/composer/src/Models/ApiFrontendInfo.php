<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\OP\Models;

use AlibabaCloud\Tea\Model;

class ApiFrontendInfo extends Model
{
    // 是否有数据传输
    /**
     * @example true, false
     *
     * @var bool
     */
    public $fileTransfer;

    // api参数
    /**
     * @example
     *
     * @var string[]
     */
    public $requestPathParams;

    // Rest请求的URI，并带有路径参数
    /**
     * @example null
     *
     * @var string
     */
    public $requestUriWithPathParams;

    // api参数
    /**
     * @example
     *
     * @var ApiParamInfo
     */
    public $requestParams;
    protected $_name = [
        'fileTransfer'             => 'file_transfer',
        'requestPathParams'        => 'request_path_params',
        'requestUriWithPathParams' => 'request_uri_with_path_params',
        'requestParams'            => 'request_params',
    ];

    public function validate()
    {
        Model::validateRequired('fileTransfer', $this->fileTransfer, true);
        Model::validateRequired('requestPathParams', $this->requestPathParams, true);
        Model::validateRequired('requestUriWithPathParams', $this->requestUriWithPathParams, true);
        Model::validateRequired('requestParams', $this->requestParams, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->fileTransfer) {
            $res['file_transfer'] = $this->fileTransfer;
        }
        if (null !== $this->requestPathParams) {
            $res['request_path_params'] = $this->requestPathParams;
        }
        if (null !== $this->requestUriWithPathParams) {
            $res['request_uri_with_path_params'] = $this->requestUriWithPathParams;
        }
        if (null !== $this->requestParams) {
            $res['request_params'] = null !== $this->requestParams ? $this->requestParams->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApiFrontendInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['file_transfer'])) {
            $model->fileTransfer = $map['file_transfer'];
        }
        if (isset($map['request_path_params'])) {
            if (!empty($map['request_path_params'])) {
                $model->requestPathParams = $map['request_path_params'];
            }
        }
        if (isset($map['request_uri_with_path_params'])) {
            $model->requestUriWithPathParams = $map['request_uri_with_path_params'];
        }
        if (isset($map['request_params'])) {
            $model->requestParams = ApiParamInfo::fromMap($map['request_params']);
        }

        return $model;
    }
}
