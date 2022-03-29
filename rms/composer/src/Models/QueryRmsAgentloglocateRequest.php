<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryRmsAgentloglocateRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // app_id
    /**
     * @var string
     */
    public $appId;

    // batch_ip_files
    /**
     * @var IpFileOs[]
     */
    public $batchIpFiles;

    // charset_str
    /**
     * @var string
     */
    public $charsetStr;

    // error_msg
    /**
     * @var string
     */
    public $errorMsg;

    // ips
    /**
     * @var string[]
     */
    public $ips;

    // ip_file
    /**
     * @var IpFileOs
     */
    public $ipFile;

    // is_batch
    /**
     * @var bool
     */
    public $isBatch;

    // log_path
    /**
     * @var string
     */
    public $logPath;

    // log_paths
    /**
     * @var string[]
     */
    public $logPaths;

    // time
    /**
     * @var int
     */
    public $time;
    protected $_name = [
        'authToken'    => 'auth_token',
        'appId'        => 'app_id',
        'batchIpFiles' => 'batch_ip_files',
        'charsetStr'   => 'charset_str',
        'errorMsg'     => 'error_msg',
        'ips'          => 'ips',
        'ipFile'       => 'ip_file',
        'isBatch'      => 'is_batch',
        'logPath'      => 'log_path',
        'logPaths'     => 'log_paths',
        'time'         => 'time',
    ];

    public function validate()
    {
        Model::validateRequired('appId', $this->appId, true);
        Model::validateRequired('batchIpFiles', $this->batchIpFiles, true);
        Model::validateRequired('charsetStr', $this->charsetStr, true);
        Model::validateRequired('errorMsg', $this->errorMsg, true);
        Model::validateRequired('ips', $this->ips, true);
        Model::validateRequired('ipFile', $this->ipFile, true);
        Model::validateRequired('isBatch', $this->isBatch, true);
        Model::validateRequired('logPath', $this->logPath, true);
        Model::validateRequired('logPaths', $this->logPaths, true);
        Model::validateRequired('time', $this->time, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->appId) {
            $res['app_id'] = $this->appId;
        }
        if (null !== $this->batchIpFiles) {
            $res['batch_ip_files'] = [];
            if (null !== $this->batchIpFiles && \is_array($this->batchIpFiles)) {
                $n = 0;
                foreach ($this->batchIpFiles as $item) {
                    $res['batch_ip_files'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->charsetStr) {
            $res['charset_str'] = $this->charsetStr;
        }
        if (null !== $this->errorMsg) {
            $res['error_msg'] = $this->errorMsg;
        }
        if (null !== $this->ips) {
            $res['ips'] = $this->ips;
        }
        if (null !== $this->ipFile) {
            $res['ip_file'] = null !== $this->ipFile ? $this->ipFile->toMap() : null;
        }
        if (null !== $this->isBatch) {
            $res['is_batch'] = $this->isBatch;
        }
        if (null !== $this->logPath) {
            $res['log_path'] = $this->logPath;
        }
        if (null !== $this->logPaths) {
            $res['log_paths'] = $this->logPaths;
        }
        if (null !== $this->time) {
            $res['time'] = $this->time;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryRmsAgentloglocateRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['app_id'])) {
            $model->appId = $map['app_id'];
        }
        if (isset($map['batch_ip_files'])) {
            if (!empty($map['batch_ip_files'])) {
                $model->batchIpFiles = [];
                $n                   = 0;
                foreach ($map['batch_ip_files'] as $item) {
                    $model->batchIpFiles[$n++] = null !== $item ? IpFileOs::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['charset_str'])) {
            $model->charsetStr = $map['charset_str'];
        }
        if (isset($map['error_msg'])) {
            $model->errorMsg = $map['error_msg'];
        }
        if (isset($map['ips'])) {
            if (!empty($map['ips'])) {
                $model->ips = $map['ips'];
            }
        }
        if (isset($map['ip_file'])) {
            $model->ipFile = IpFileOs::fromMap($map['ip_file']);
        }
        if (isset($map['is_batch'])) {
            $model->isBatch = $map['is_batch'];
        }
        if (isset($map['log_path'])) {
            $model->logPath = $map['log_path'];
        }
        if (isset($map['log_paths'])) {
            if (!empty($map['log_paths'])) {
                $model->logPaths = $map['log_paths'];
            }
        }
        if (isset($map['time'])) {
            $model->time = $map['time'];
        }

        return $model;
    }
}
