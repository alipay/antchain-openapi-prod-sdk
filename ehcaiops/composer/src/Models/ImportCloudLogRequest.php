<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\EHCAIOPS\Models;

use AlibabaCloud\Tea\Model;

class ImportCloudLogRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 业务码
    /**
     * @var string
     */
    public $busCode;

    // 场景码
    /**
     * @var string
     */
    public $sceneCode;

    // 日志报文
    /**
     * @var string
     */
    public $logMessage;

    // 是否批量上传
    /**
     * @var bool
     */
    public $batchImport;

    // 日志行内元素分隔符，默认|
    /**
     * @var string
     */
    public $elementSeparator;

    // 日志行分隔符，默认$
    /**
     * @var string
     */
    public $lineSeparator;
    protected $_name = [
        'authToken'        => 'auth_token',
        'busCode'          => 'bus_code',
        'sceneCode'        => 'scene_code',
        'logMessage'       => 'log_message',
        'batchImport'      => 'batch_import',
        'elementSeparator' => 'element_separator',
        'lineSeparator'    => 'line_separator',
    ];

    public function validate()
    {
        Model::validateRequired('busCode', $this->busCode, true);
        Model::validateRequired('sceneCode', $this->sceneCode, true);
        Model::validateRequired('logMessage', $this->logMessage, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->busCode) {
            $res['bus_code'] = $this->busCode;
        }
        if (null !== $this->sceneCode) {
            $res['scene_code'] = $this->sceneCode;
        }
        if (null !== $this->logMessage) {
            $res['log_message'] = $this->logMessage;
        }
        if (null !== $this->batchImport) {
            $res['batch_import'] = $this->batchImport;
        }
        if (null !== $this->elementSeparator) {
            $res['element_separator'] = $this->elementSeparator;
        }
        if (null !== $this->lineSeparator) {
            $res['line_separator'] = $this->lineSeparator;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ImportCloudLogRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['bus_code'])) {
            $model->busCode = $map['bus_code'];
        }
        if (isset($map['scene_code'])) {
            $model->sceneCode = $map['scene_code'];
        }
        if (isset($map['log_message'])) {
            $model->logMessage = $map['log_message'];
        }
        if (isset($map['batch_import'])) {
            $model->batchImport = $map['batch_import'];
        }
        if (isset($map['element_separator'])) {
            $model->elementSeparator = $map['element_separator'];
        }
        if (isset($map['line_separator'])) {
            $model->lineSeparator = $map['line_separator'];
        }

        return $model;
    }
}
